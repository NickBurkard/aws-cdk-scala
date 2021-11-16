package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DashboardSourceTemplateProperty {

  def apply(
    arn: String,
    dataSetReferences: List[_]
  ): software.amazon.awscdk.services.quicksight.CfnDashboard.DashboardSourceTemplateProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDashboard.DashboardSourceTemplateProperty.Builder)
      .arn(arn)
      .dataSetReferences(dataSetReferences.asJava)
      .build()
}
