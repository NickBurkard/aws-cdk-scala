package io.burkard.cdk.services.secretsmanager

sealed abstract class AttachmentTargetType(val underlying: software.amazon.awscdk.services.secretsmanager.AttachmentTargetType)
  extends Product
    with Serializable

@scala.annotation.nowarn("cat=deprecation")
object AttachmentTargetType {
  implicit def toAws(value: AttachmentTargetType): software.amazon.awscdk.services.secretsmanager.AttachmentTargetType =
    Option(value).map(_.underlying).orNull

  case object Instance
    extends AttachmentTargetType(software.amazon.awscdk.services.secretsmanager.AttachmentTargetType.INSTANCE)

  case object Cluster
    extends AttachmentTargetType(software.amazon.awscdk.services.secretsmanager.AttachmentTargetType.CLUSTER)

  case object RdsDbProxy
    extends AttachmentTargetType(software.amazon.awscdk.services.secretsmanager.AttachmentTargetType.RDS_DB_PROXY)

  case object RedshiftCluster
    extends AttachmentTargetType(software.amazon.awscdk.services.secretsmanager.AttachmentTargetType.REDSHIFT_CLUSTER)

  case object DocdbDbInstance
    extends AttachmentTargetType(software.amazon.awscdk.services.secretsmanager.AttachmentTargetType.DOCDB_DB_INSTANCE)

  case object DocdbDbCluster
    extends AttachmentTargetType(software.amazon.awscdk.services.secretsmanager.AttachmentTargetType.DOCDB_DB_CLUSTER)
}
