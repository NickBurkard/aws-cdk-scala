package io.burkard.cdk.services.mediaconvert

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnJobTemplateProps {

  def apply(
    settingsJson: Option[AnyRef] = None,
    queue: Option[String] = None,
    statusUpdateInterval: Option[String] = None,
    category: Option[String] = None,
    accelerationSettings: Option[software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.AccelerationSettingsProperty] = None,
    hopDestinations: Option[List[_]] = None,
    name: Option[String] = None,
    priority: Option[Number] = None,
    description: Option[String] = None,
    tags: Option[AnyRef] = None
  ): software.amazon.awscdk.services.mediaconvert.CfnJobTemplateProps =
    (new software.amazon.awscdk.services.mediaconvert.CfnJobTemplateProps.Builder)
      .settingsJson(settingsJson.orNull)
      .queue(queue.orNull)
      .statusUpdateInterval(statusUpdateInterval.orNull)
      .category(category.orNull)
      .accelerationSettings(accelerationSettings.orNull)
      .hopDestinations(hopDestinations.map(_.asJava).orNull)
      .name(name.orNull)
      .priority(priority.orNull)
      .description(description.orNull)
      .tags(tags.orNull)
      .build()
}
