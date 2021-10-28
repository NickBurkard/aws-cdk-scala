package io.burkard.cdk.services.emr

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ApplicationProperty {

  def apply(
    name: Option[String] = None,
    version: Option[String] = None,
    additionalInfo: Option[Map[String, String]] = None,
    args: Option[List[String]] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.ApplicationProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.ApplicationProperty.Builder)
      .name(name.orNull)
      .version(version.orNull)
      .additionalInfo(additionalInfo.map(_.asJava).orNull)
      .args(args.map(_.asJava).orNull)
      .build()
}
