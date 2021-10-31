package io.burkard.cdk.services.ssmcontacts

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StageProperty {

  def apply(
    targets: Option[List[_]] = None,
    durationInMinutes: Option[Number] = None
  ): software.amazon.awscdk.services.ssmcontacts.CfnContact.StageProperty =
    (new software.amazon.awscdk.services.ssmcontacts.CfnContact.StageProperty.Builder)
      .targets(targets.map(_.asJava).orNull)
      .durationInMinutes(durationInMinutes.orNull)
      .build()
}
