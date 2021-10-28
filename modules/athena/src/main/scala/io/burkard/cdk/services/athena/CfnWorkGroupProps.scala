package io.burkard.cdk.services.athena

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnWorkGroupProps {

  def apply(
    name: Option[String] = None,
    state: Option[String] = None,
    workGroupConfiguration: Option[software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationProperty] = None,
    workGroupConfigurationUpdates: Option[software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationUpdatesProperty] = None,
    recursiveDeleteOption: Option[Boolean] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.athena.CfnWorkGroupProps =
    (new software.amazon.awscdk.services.athena.CfnWorkGroupProps.Builder)
      .name(name.orNull)
      .state(state.orNull)
      .workGroupConfiguration(workGroupConfiguration.orNull)
      .workGroupConfigurationUpdates(workGroupConfigurationUpdates.orNull)
      .recursiveDeleteOption(recursiveDeleteOption.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}