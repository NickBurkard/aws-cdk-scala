package io.burkard.cdk.services.resourcegroups

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
