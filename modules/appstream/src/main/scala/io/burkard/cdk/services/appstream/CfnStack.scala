package io.burkard.cdk.services.appstream

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnStack {

  def apply(
    internalResourceId: String,
    displayName: Option[String] = None,
    name: Option[String] = None,
    attributesToDelete: Option[List[String]] = None,
    applicationSettings: Option[software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty] = None,
    feedbackUrl: Option[String] = None,
    userSettings: Option[List[_]] = None,
    storageConnectors: Option[List[_]] = None,
    deleteStorageConnectors: Option[Boolean] = None,
    embedHostDomains: Option[List[String]] = None,
    accessEndpoints: Option[List[_]] = None,
    redirectUrl: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appstream.CfnStack =
    software.amazon.awscdk.services.appstream.CfnStack.Builder
      .create(stackCtx, internalResourceId)
      .displayName(displayName.orNull)
      .name(name.orNull)
      .attributesToDelete(attributesToDelete.map(_.asJava).orNull)
      .applicationSettings(applicationSettings.orNull)
      .feedbackUrl(feedbackUrl.orNull)
      .userSettings(userSettings.map(_.asJava).orNull)
      .storageConnectors(storageConnectors.map(_.asJava).orNull)
      .deleteStorageConnectors(deleteStorageConnectors.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .embedHostDomains(embedHostDomains.map(_.asJava).orNull)
      .accessEndpoints(accessEndpoints.map(_.asJava).orNull)
      .redirectUrl(redirectUrl.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
