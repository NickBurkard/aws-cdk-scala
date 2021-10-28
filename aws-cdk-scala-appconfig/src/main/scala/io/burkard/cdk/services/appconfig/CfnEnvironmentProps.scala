package io.burkard.cdk.services.appconfig

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEnvironmentProps {

  def apply(
    name: Option[String] = None,
    applicationId: Option[String] = None,
    monitors: Option[List[_]] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.appconfig.CfnEnvironment.TagsProperty]] = None
  ): software.amazon.awscdk.services.appconfig.CfnEnvironmentProps =
    (new software.amazon.awscdk.services.appconfig.CfnEnvironmentProps.Builder)
      .name(name.orNull)
      .applicationId(applicationId.orNull)
      .monitors(monitors.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
