package io.burkard.cdk.services.ssmcontacts

import scala.jdk.CollectionConverters._

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
