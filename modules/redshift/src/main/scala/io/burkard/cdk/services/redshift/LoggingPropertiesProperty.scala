package io.burkard.cdk.services.redshift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoggingPropertiesProperty {

  def apply(
    bucketName: String,
    s3KeyPrefix: Option[String] = None
  ): software.amazon.awscdk.services.redshift.CfnCluster.LoggingPropertiesProperty =
    (new software.amazon.awscdk.services.redshift.CfnCluster.LoggingPropertiesProperty.Builder)
      .bucketName(bucketName)
      .s3KeyPrefix(s3KeyPrefix.orNull)
      .build()
}
