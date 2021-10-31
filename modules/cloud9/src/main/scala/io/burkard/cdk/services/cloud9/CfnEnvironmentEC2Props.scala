package io.burkard.cdk.services.cloud9

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEnvironmentEC2Props {

  def apply(
    name: Option[String] = None,
    instanceType: Option[String] = None,
    imageId: Option[String] = None,
    repositories: Option[List[_]] = None,
    ownerArn: Option[String] = None,
    connectionType: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    subnetId: Option[String] = None,
    automaticStopTimeMinutes: Option[Number] = None
  ): software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props =
    (new software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props.Builder)
      .name(name.orNull)
      .instanceType(instanceType.orNull)
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
