package io.burkard.cdk.services.codecommit

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CodeProperty {

  def apply(
    s3: software.amazon.awscdk.services.codecommit.CfnRepository.S3Property,
    branchName: Option[String] = None
  ): software.amazon.awscdk.services.codecommit.CfnRepository.CodeProperty =
    (new software.amazon.awscdk.services.codecommit.CfnRepository.CodeProperty.Builder)
      .s3(s3)
      .branchName(branchName.orNull)
      .build()
}
