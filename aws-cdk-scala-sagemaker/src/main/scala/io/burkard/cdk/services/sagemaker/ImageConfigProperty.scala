package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ImageConfigProperty {

  def apply(
    repositoryAuthConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModel.RepositoryAuthConfigProperty] = None,
    repositoryAccessMode: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModel.ImageConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModel.ImageConfigProperty.Builder)
      .repositoryAuthConfig(repositoryAuthConfig.orNull)
      .repositoryAccessMode(repositoryAccessMode.orNull)
      .build()
}
