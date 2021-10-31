package io.burkard.cdk.services.glue

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EncryptionConfigurationProperty {

  def apply(
    s3Encryptions: Option[List[_]] = None,
    cloudWatchEncryption: Option[software.amazon.awscdk.services.glue.CfnSecurityConfiguration.CloudWatchEncryptionProperty] = None,
    jobBookmarksEncryption: Option[software.amazon.awscdk.services.glue.CfnSecurityConfiguration.JobBookmarksEncryptionProperty] = None
  ): software.amazon.awscdk.services.glue.CfnSecurityConfiguration.EncryptionConfigurationProperty =
    (new software.amazon.awscdk.services.glue.CfnSecurityConfiguration.EncryptionConfigurationProperty.Builder)
      .s3Encryptions(s3Encryptions.map(_.asJava).orNull)
      .cloudWatchEncryption(cloudWatchEncryption.orNull)
      .jobBookmarksEncryption(jobBookmarksEncryption.orNull)
      .build()
}
