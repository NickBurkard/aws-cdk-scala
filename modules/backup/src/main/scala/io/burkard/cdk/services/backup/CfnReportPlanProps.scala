package io.burkard.cdk.services.backup

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnReportPlanProps {

  def apply(
    reportSetting: Option[AnyRef] = None,
    reportDeliveryChannel: Option[AnyRef] = None,
    reportPlanName: Option[String] = None,
    reportPlanDescription: Option[String] = None,
    reportPlanTags: Option[List[_]] = None
  ): software.amazon.awscdk.services.backup.CfnReportPlanProps =
    (new software.amazon.awscdk.services.backup.CfnReportPlanProps.Builder)
      .reportSetting(reportSetting.orNull)
      .reportDeliveryChannel(reportDeliveryChannel.orNull)
      .reportPlanName(reportPlanName.orNull)
      .reportPlanDescription(reportPlanDescription.orNull)
      .reportPlanTags(reportPlanTags.map(_.asJava).orNull)
      .build()
}
