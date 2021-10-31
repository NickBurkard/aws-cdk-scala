package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NotebookInstanceLifecycleHookProperty {

  def apply(
    content: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig.NotebookInstanceLifecycleHookProperty.Builder)
      .content(content.orNull)
      .build()
}
