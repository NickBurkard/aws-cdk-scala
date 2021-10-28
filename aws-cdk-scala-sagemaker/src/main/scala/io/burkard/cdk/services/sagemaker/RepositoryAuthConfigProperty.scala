package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RepositoryAuthConfigProperty {

  def apply(
    repositoryCredentialsProviderArn: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModel.RepositoryAuthConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModel.RepositoryAuthConfigProperty.Builder)
      .repositoryCredentialsProviderArn(repositoryCredentialsProviderArn.orNull)
      .build()
}
