package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InferenceExecutionConfigProperty {

  def apply(
    mode: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModel.InferenceExecutionConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModel.InferenceExecutionConfigProperty.Builder)
      .mode(mode.orNull)
      .build()
}
