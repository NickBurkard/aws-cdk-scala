package io.burkard.cdk.services.appconfig

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConfigurationProfileProps {

  def apply(
    retrievalRoleArn: Option[String] = None,
    name: Option[String] = None,
    applicationId: Option[String] = None,
    validators: Option[List[_]] = None,
    locationUri: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.appconfig.CfnConfigurationProfile.TagsProperty]] = None
  ): software.amazon.awscdk.services.appconfig.CfnConfigurationProfileProps =
    (new software.amazon.awscdk.services.appconfig.CfnConfigurationProfileProps.Builder)
      .retrievalRoleArn(retrievalRoleArn.orNull)
      .name(name.orNull)
      .applicationId(applicationId.orNull)
      .validators(validators.map(_.asJava).orNull)
      .locationUri(locationUri.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
