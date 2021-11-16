package io.burkard.cdk.services.ssmincidents

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IncidentTemplateProperty {

  def apply(
    impact: Number,
    title: String,
    dedupeString: Option[String] = None,
    summary: Option[String] = None,
    notificationTargets: Option[List[_]] = None
  ): software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IncidentTemplateProperty =
    (new software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IncidentTemplateProperty.Builder)
      .impact(impact)
      .title(title)
      .dedupeString(dedupeString.orNull)
      .summary(summary.orNull)
      .notificationTargets(notificationTargets.map(_.asJava).orNull)
      .build()
}
