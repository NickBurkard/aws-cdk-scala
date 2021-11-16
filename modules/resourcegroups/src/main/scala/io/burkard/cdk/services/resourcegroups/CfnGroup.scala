package io.burkard.cdk.services.resourcegroups

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGroup {

  def apply(
    internalResourceId: String,
    name: String,
    configuration: Option[List[_]] = None,
    resources: Option[List[String]] = None,
    resourceQuery: Option[software.amazon.awscdk.services.resourcegroups.CfnGroup.ResourceQueryProperty] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.resourcegroups.CfnGroup =
    software.amazon.awscdk.services.resourcegroups.CfnGroup.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .configuration(configuration.map(_.asJava).orNull)
      .resources(resources.map(_.asJava).orNull)
      .resourceQuery(resourceQuery.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
