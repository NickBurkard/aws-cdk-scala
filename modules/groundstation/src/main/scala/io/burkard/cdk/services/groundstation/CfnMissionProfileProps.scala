package io.burkard.cdk.services.groundstation

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMissionProfileProps {

  def apply(
    trackingConfigArn: String,
    dataflowEdges: List[_],
    name: String,
    minimumViableContactDurationSeconds: Number,
    contactPrePassDurationSeconds: Option[Number] = None,
    contactPostPassDurationSeconds: Option[Number] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.groundstation.CfnMissionProfileProps =
    (new software.amazon.awscdk.services.groundstation.CfnMissionProfileProps.Builder)
      .trackingConfigArn(trackingConfigArn)
      .dataflowEdges(dataflowEdges.asJava)
      .name(name)
      .minimumViableContactDurationSeconds(minimumViableContactDurationSeconds)
      .contactPrePassDurationSeconds(contactPrePassDurationSeconds.orNull)
      .contactPostPassDurationSeconds(contactPostPassDurationSeconds.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
