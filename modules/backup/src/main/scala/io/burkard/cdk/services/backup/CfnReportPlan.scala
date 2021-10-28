package io.burkard.cdk.services.backup

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnReportPlan {

  def apply(
    internalResourceId: String,
    reportSetting: Option[AnyRef] = None,
    reportDeliveryChannel: Option[AnyRef] = None,
    reportPlanName: Option[String] = None,
    reportPlanDescription: Option[String] = None,
    reportPlanTags: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.backup.CfnReportPlan =
    software.amazon.awscdk.services.backup.CfnReportPlan.Builder
      .create(stackCtx, internalResourceId)
      .reportSetting(reportSetting.orNull)
      .reportDeliveryChannel(reportDeliveryChannel.orNull)
      .reportPlanName(reportPlanName.orNull)
      .reportPlanDescription(reportPlanDescription.orNull)
      .reportPlanTags(reportPlanTags.map(_.asJava).orNull)
      .build()
}
