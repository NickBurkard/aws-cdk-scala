package io.burkard.cdk.services.synthetics

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BaseScreenshotProperty {

  def apply(
    screenshotName: Option[String] = None,
    ignoreCoordinates: Option[List[String]] = None
  ): software.amazon.awscdk.services.synthetics.CfnCanary.BaseScreenshotProperty =
    (new software.amazon.awscdk.services.synthetics.CfnCanary.BaseScreenshotProperty.Builder)
      .screenshotName(screenshotName.orNull)
      .ignoreCoordinates(ignoreCoordinates.map(_.asJava).orNull)
      .build()
}
