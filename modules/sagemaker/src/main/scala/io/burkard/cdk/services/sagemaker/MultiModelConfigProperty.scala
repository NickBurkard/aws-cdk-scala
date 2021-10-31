package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MultiModelConfigProperty {

  def apply(
    modelCacheSetting: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModel.MultiModelConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModel.MultiModelConfigProperty.Builder)
      .modelCacheSetting(modelCacheSetting.orNull)
      .build()
}
