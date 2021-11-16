package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GitConfigProperty {

  def apply(
    repositoryUrl: String,
    branch: Option[String] = None,
    secretArn: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnCodeRepository.GitConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnCodeRepository.GitConfigProperty.Builder)
      .repositoryUrl(repositoryUrl)
      .branch(branch.orNull)
      .secretArn(secretArn.orNull)
      .build()
}
