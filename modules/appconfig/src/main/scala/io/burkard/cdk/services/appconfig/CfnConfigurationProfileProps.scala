package io.burkard.cdk.services.appconfig

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConfigurationProfileProps {

  def apply(
    name: String,
    applicationId: String,
    locationUri: String,
    retrievalRoleArn: Option[String] = None,
    validators: Option[List[_]] = None,
    `type`: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.appconfig.CfnConfigurationProfile.TagsProperty]] = None
  ): software.amazon.awscdk.services.appconfig.CfnConfigurationProfileProps =
    (new software.amazon.awscdk.services.appconfig.CfnConfigurationProfileProps.Builder)
      .name(name)
      .applicationId(applicationId)
      .locationUri(locationUri)
      .retrievalRoleArn(retrievalRoleArn.orNull)
      .validators(validators.map(_.asJava).orNull)
      .`type`(`type`.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
