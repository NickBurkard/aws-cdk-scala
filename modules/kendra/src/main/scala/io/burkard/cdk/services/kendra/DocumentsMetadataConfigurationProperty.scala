package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DocumentsMetadataConfigurationProperty {

  def apply(
    s3Prefix: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.DocumentsMetadataConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.DocumentsMetadataConfigurationProperty.Builder)
      .s3Prefix(s3Prefix.orNull)
      .build()
}
