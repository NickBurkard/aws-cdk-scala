package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RepositoryAuthConfigProperty {

  def apply(
    repositoryCredentialsProviderArn: String
  ): software.amazon.awscdk.services.sagemaker.CfnModel.RepositoryAuthConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModel.RepositoryAuthConfigProperty.Builder)
      .repositoryCredentialsProviderArn(repositoryCredentialsProviderArn)
      .build()
}
