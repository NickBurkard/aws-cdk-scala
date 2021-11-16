package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ImageConfigProperty {

  def apply(
    repositoryAccessMode: String,
    repositoryAuthConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModel.RepositoryAuthConfigProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModel.ImageConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModel.ImageConfigProperty.Builder)
      .repositoryAccessMode(repositoryAccessMode)
      .repositoryAuthConfig(repositoryAuthConfig.orNull)
      .build()
}
