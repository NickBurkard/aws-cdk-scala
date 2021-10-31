package io.burkard.cdk.services.licensemanager

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnGrantProps {

  def apply(
    licenseArn: Option[String] = None,
    principals: Option[List[String]] = None,
    grantName: Option[String] = None,
    allowedOperations: Option[List[String]] = None,
    status: Option[String] = None,
    homeRegion: Option[String] = None
  ): software.amazon.awscdk.services.licensemanager.CfnGrantProps =
    (new software.amazon.awscdk.services.licensemanager.CfnGrantProps.Builder)
      .licenseArn(licenseArn.orNull)
      .principals(principals.map(_.asJava).orNull)
      .grantName(grantName.orNull)
      .allowedOperations(allowedOperations.map(_.asJava).orNull)
      .status(status.orNull)
      .homeRegion(homeRegion.orNull)
      .build()
}
