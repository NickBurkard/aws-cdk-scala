package io.burkard.cdk.services.codecommit

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CodeProperty {

  def apply(
    s3: Option[software.amazon.awscdk.services.codecommit.CfnRepository.S3Property] = None,
    branchName: Option[String] = None
  ): software.amazon.awscdk.services.codecommit.CfnRepository.CodeProperty =
    (new software.amazon.awscdk.services.codecommit.CfnRepository.CodeProperty.Builder)
      .s3(s3.orNull)
      .branchName(branchName.orNull)
      .build()
}
