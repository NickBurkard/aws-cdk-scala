package io.burkard.cdk.services.applicationinsights

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomComponentProperty {

  def apply(
    componentName: String,
    resourceList: List[String]
  ): software.amazon.awscdk.services.applicationinsights.CfnApplication.CustomComponentProperty =
    (new software.amazon.awscdk.services.applicationinsights.CfnApplication.CustomComponentProperty.Builder)
      .componentName(componentName)
      .resourceList(resourceList.asJava)
      .build()
}
