package io.burkard.cdk.services.kendra

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConfluenceSpaceConfigurationProperty {

  def apply(
    includeSpaces: Option[List[String]] = None,
    spaceFieldMappings: Option[List[_]] = None,
    crawlArchivedSpaces: Option[Boolean] = None,
    excludeSpaces: Option[List[String]] = None,
    crawlPersonalSpaces: Option[Boolean] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceConfigurationProperty.Builder)
      .includeSpaces(includeSpaces.map(_.asJava).orNull)
      .spaceFieldMappings(spaceFieldMappings.map(_.asJava).orNull)
      .crawlArchivedSpaces(crawlArchivedSpaces.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .excludeSpaces(excludeSpaces.map(_.asJava).orNull)
      .crawlPersonalSpaces(crawlPersonalSpaces.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}