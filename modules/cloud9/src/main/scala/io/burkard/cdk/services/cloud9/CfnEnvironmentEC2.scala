package io.burkard.cdk.services.cloud9

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEnvironmentEC2 {

  def apply(
    internalResourceId: String,
    instanceType: String,
    name: Option[String] = None,
    imageId: Option[String] = None,
    repositories: Option[List[_]] = None,
    ownerArn: Option[String] = None,
    connectionType: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    subnetId: Option[String] = None,
    automaticStopTimeMinutes: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2 =
    software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2.Builder
      .create(stackCtx, internalResourceId)
      .instanceType(instanceType)
      .name(name.orNull)
      .imageId(imageId.orNull)
      .repositories(repositories.map(_.asJava).orNull)
      .ownerArn(ownerArn.orNull)
      .connectionType(connectionType.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .subnetId(subnetId.orNull)
      .automaticStopTimeMinutes(automaticStopTimeMinutes.orNull)
      .build()
}
