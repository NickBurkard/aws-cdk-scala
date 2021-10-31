package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3DataSourceConfigurationProperty {

  def apply(
    exclusionPatterns: Option[List[String]] = None,
    accessControlListConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.AccessControlListConfigurationProperty] = None,
    inclusionPrefixes: Option[List[String]] = None,
    inclusionPatterns: Option[List[String]] = None,
    documentsMetadataConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.DocumentsMetadataConfigurationProperty] = None,
    bucketName: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.S3DataSourceConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.S3DataSourceConfigurationProperty.Builder)
      .exclusionPatterns(exclusionPatterns.map(_.asJava).orNull)
      .accessControlListConfiguration(accessControlListConfiguration.orNull)
      .inclusionPrefixes(inclusionPrefixes.map(_.asJava).orNull)
      .inclusionPatterns(inclusionPatterns.map(_.asJava).orNull)
      .documentsMetadataConfiguration(documentsMetadataConfiguration.orNull)
      .bucketName(bucketName.orNull)
      .build()
}
