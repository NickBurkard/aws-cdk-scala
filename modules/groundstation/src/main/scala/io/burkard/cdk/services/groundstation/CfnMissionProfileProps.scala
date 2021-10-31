package io.burkard.cdk.services.groundstation

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnMissionProfileProps {

  def apply(
    trackingConfigArn: Option[String] = None,
    dataflowEdges: Option[List[_]] = None,
    contactPrePassDurationSeconds: Option[Number] = None,
    name: Option[String] = None,
    contactPostPassDurationSeconds: Option[Number] = None,
    minimumViableContactDurationSeconds: Option[Number] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.groundstation.CfnMissionProfileProps =
    (new software.amazon.awscdk.services.groundstation.CfnMissionProfileProps.Builder)
      .trackingConfigArn(trackingConfigArn.orNull)
      .dataflowEdges(dataflowEdges.map(_.asJava).orNull)
      .contactPrePassDurationSeconds(contactPrePassDurationSeconds.orNull)
      .name(name.orNull)
      .contactPostPassDurationSeconds(contactPostPassDurationSeconds.orNull)
      .minimumViableContactDurationSeconds(minimumViableContactDurationSeconds.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
