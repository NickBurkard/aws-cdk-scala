package io.burkard.cdk.services.appconfig

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEnvironment {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    applicationId: Option[String] = None,
    monitors: Option[List[_]] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.appconfig.CfnEnvironment.TagsProperty]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appconfig.CfnEnvironment =
    software.amazon.awscdk.services.appconfig.CfnEnvironment.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .applicationId(applicationId.orNull)
      .monitors(monitors.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
