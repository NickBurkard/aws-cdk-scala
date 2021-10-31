package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
