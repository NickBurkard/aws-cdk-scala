package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GitConfigProperty {

  def apply(
    branch: Option[String] = None,
    repositoryUrl: Option[String] = None,
    secretArn: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnCodeRepository.GitConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnCodeRepository.GitConfigProperty.Builder)
      .branch(branch.orNull)
      .repositoryUrl(repositoryUrl.orNull)
      .secretArn(secretArn.orNull)
      .build()
}
