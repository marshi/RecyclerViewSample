package marshi.app

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.example.androidtemplate.R
import com.example.androidtemplate.databinding.AppFragmentBinding
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class AppFragment : DaggerFragment(R.layout.app_fragment) {

  companion object {
    fun newInstance() = AppFragment()
  }

  @Inject
  lateinit var viewModelFactory: ViewModelFactory<AppViewModel>
  private val viewModel: AppViewModel by viewModels { viewModelFactory }
  private lateinit var binding: AppFragmentBinding

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    binding = AppFragmentBinding.bind(view)
    viewModel.plus(1, 2)
  }
}
