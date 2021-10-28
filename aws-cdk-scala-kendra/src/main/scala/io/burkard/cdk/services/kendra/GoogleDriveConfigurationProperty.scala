package io.burkard.cdk.services.kendra

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GoogleDriveConfigurationProperty {

  def apply(
    exclusionPatterns: Option[List[String]] = None,
    fieldMappings: Option[List[_]] = None,
    excludeUserAccounts: Option[List[String]] = None,
    inclusionPatterns: Option[List[String]] = None,
    excludeSharedDrives: Option[List[String]] = None,
    excludeMimeTypes: Option[List[String]] = None,
    secretArn: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.GoogleDriveConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.GoogleDriveConfigurationProperty.Builder)
      .exclusionPatterns(exclusionPatterns.map(_.asJava).orNull)
      .fieldMappings(fieldMappings.map(_.asJava).orNull)
      .excludeUserAccounts(excludeUserAccounts.map(_.asJava).orNull)
      .inclusionPatterns(inclusionPatterns.map(_.asJava).orNull)
      .excludeSharedDrives(excludeSharedDrives.map(_.asJava).orNull)
      .excludeMimeTypes(excludeMimeTypes.map(_.asJava).orNull)
      .secretArn(secretArn.orNull)
      .build()
}
