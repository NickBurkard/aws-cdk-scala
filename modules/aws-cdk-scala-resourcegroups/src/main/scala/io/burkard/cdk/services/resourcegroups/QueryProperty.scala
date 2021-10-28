package io.burkard.cdk.services.resourcegroups

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object QueryProperty {

  def apply(
    tagFilters: Option[List[_]] = None,
    stackIdentifier: Option[String] = None,
    resourceTypeFilters: Option[List[String]] = None
  ): software.amazon.awscdk.services.resourcegroups.CfnGroup.QueryProperty =
    (new software.amazon.awscdk.services.resourcegroups.CfnGroup.QueryProperty.Builder)
      .tagFilters(tagFilters.map(_.asJava).orNull)
      .stackIdentifier(stackIdentifier.orNull)
      .resourceTypeFilters(resourceTypeFilters.map(_.asJava).orNull)
      .build()
}
