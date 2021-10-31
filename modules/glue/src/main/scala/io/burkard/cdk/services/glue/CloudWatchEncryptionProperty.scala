package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CloudWatchEncryptionProperty {

  def apply(
    kmsKeyArn: Option[String] = None,
    cloudWatchEncryptionMode: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnSecurityConfiguration.CloudWatchEncryptionProperty =
    (new software.amazon.awscdk.services.glue.CfnSecurityConfiguration.CloudWatchEncryptionProperty.Builder)
      .kmsKeyArn(kmsKeyArn.orNull)
      .cloudWatchEncryptionMode(cloudWatchEncryptionMode.orNull)
      .build()
}
