package io.burkard.cdk.services.applicationinsights

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CustomComponentProperty {

  def apply(
    componentName: Option[String] = None,
    resourceList: Option[List[String]] = None
  ): software.amazon.awscdk.services.applicationinsights.CfnApplication.CustomComponentProperty =
    (new software.amazon.awscdk.services.applicationinsights.CfnApplication.CustomComponentProperty.Builder)
      .componentName(componentName.orNull)
      .resourceList(resourceList.map(_.asJava).orNull)
      .build()
}
