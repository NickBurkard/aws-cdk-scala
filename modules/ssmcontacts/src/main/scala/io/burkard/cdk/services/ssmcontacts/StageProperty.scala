package io.burkard.cdk.services.ssmcontacts

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StageProperty {

  def apply(
    durationInMinutes: Number,
    targets: Option[List[_]] = None
  ): software.amazon.awscdk.services.ssmcontacts.CfnContact.StageProperty =
    (new software.amazon.awscdk.services.ssmcontacts.CfnContact.StageProperty.Builder)
      .durationInMinutes(durationInMinutes)
      .targets(targets.map(_.asJava).orNull)
      .build()
}
