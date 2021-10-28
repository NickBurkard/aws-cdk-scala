package io.burkard.cdk.services.route53

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRecordSetProps {

  def apply(
    geoLocation: Option[software.amazon.awscdk.services.route53.CfnRecordSet.GeoLocationProperty] = None,
    weight: Option[Number] = None,
    name: Option[String] = None,
    healthCheckId: Option[String] = None,
    aliasTarget: Option[software.amazon.awscdk.services.route53.CfnRecordSet.AliasTargetProperty] = None,
    hostedZoneId: Option[String] = None,
    setIdentifier: Option[String] = None,
    multiValueAnswer: Option[Boolean] = None,
    hostedZoneName: Option[String] = None,
    comment: Option[String] = None,
    resourceRecords: Option[List[String]] = None,
    region: Option[String] = None,
    failover: Option[String] = None,
    ttl: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.route53.CfnRecordSetProps =
    (new software.amazon.awscdk.services.route53.CfnRecordSetProps.Builder)
      .geoLocation(geoLocation.orNull)
      .weight(weight.orNull)
      .name(name.orNull)
      .healthCheckId(healthCheckId.orNull)
      .aliasTarget(aliasTarget.orNull)
      .hostedZoneId(hostedZoneId.orNull)
      .setIdentifier(setIdentifier.orNull)
      .multiValueAnswer(multiValueAnswer.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .hostedZoneName(hostedZoneName.orNull)
      .comment(comment.orNull)
      .resourceRecords(resourceRecords.map(_.asJava).orNull)
      .region(region.orNull)
      .failover(failover.orNull)
      .ttl(ttl.orNull)
      .`type`(`type`.orNull)
      .build()
}
