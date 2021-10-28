package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object JobBookmarksEncryptionProperty {

  def apply(
    jobBookmarksEncryptionMode: Option[String] = None,
    kmsKeyArn: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnSecurityConfiguration.JobBookmarksEncryptionProperty =
    (new software.amazon.awscdk.services.glue.CfnSecurityConfiguration.JobBookmarksEncryptionProperty.Builder)
      .jobBookmarksEncryptionMode(jobBookmarksEncryptionMode.orNull)
      .kmsKeyArn(kmsKeyArn.orNull)
      .build()
}
