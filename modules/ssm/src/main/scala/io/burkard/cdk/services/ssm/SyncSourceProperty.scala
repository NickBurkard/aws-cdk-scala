package io.burkard.cdk.services.ssm

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SyncSourceProperty {

  def apply(
    sourceType: Option[String] = None,
    includeFutureRegions: Option[Boolean] = None,
    sourceRegions: Option[List[String]] = None,
    awsOrganizationsSource: Option[software.amazon.awscdk.services.ssm.CfnResourceDataSync.AwsOrganizationsSourceProperty] = None
  ): software.amazon.awscdk.services.ssm.CfnResourceDataSync.SyncSourceProperty =
    (new software.amazon.awscdk.services.ssm.CfnResourceDataSync.SyncSourceProperty.Builder)
      .sourceType(sourceType.orNull)
      .includeFutureRegions(includeFutureRegions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sourceRegions(sourceRegions.map(_.asJava).orNull)
      .awsOrganizationsSource(awsOrganizationsSource.orNull)
      .build()
}
