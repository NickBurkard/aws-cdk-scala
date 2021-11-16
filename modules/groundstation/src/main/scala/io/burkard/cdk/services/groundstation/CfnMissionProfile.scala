package io.burkard.cdk.services.groundstation

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMissionProfile {

  def apply(
    internalResourceId: String,
    trackingConfigArn: String,
    dataflowEdges: List[_],
    name: String,
    minimumViableContactDurationSeconds: Number,
    contactPrePassDurationSeconds: Option[Number] = None,
    contactPostPassDurationSeconds: Option[Number] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.groundstation.CfnMissionProfile =
    software.amazon.awscdk.services.groundstation.CfnMissionProfile.Builder
      .create(stackCtx, internalResourceId)
      .trackingConfigArn(trackingConfigArn)
      .dataflowEdges(dataflowEdges.asJava)
      .name(name)
      .minimumViableContactDurationSeconds(minimumViableContactDurationSeconds)
      .contactPrePassDurationSeconds(contactPrePassDurationSeconds.orNull)
      .contactPostPassDurationSeconds(contactPostPassDurationSeconds.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
