package io.burkard.cdk.services.secretsmanager

sealed abstract class AttachmentTargetType(val underlying: software.amazon.awscdk.services.secretsmanager.AttachmentTargetType)
  extends Product
    with Serializable

object AttachmentTargetType {
  implicit def toAws(value: AttachmentTargetType): software.amazon.awscdk.services.secretsmanager.AttachmentTargetType =
    Option(value).map(_.underlying).orNull

  case object DocdbDbCluster
    extends AttachmentTargetType(software.amazon.awscdk.services.secretsmanager.AttachmentTargetType.DOCDB_DB_CLUSTER)

  case object DocdbDbInstance
    extends AttachmentTargetType(software.amazon.awscdk.services.secretsmanager.AttachmentTargetType.DOCDB_DB_INSTANCE)

  case object RdsDbCluster
    extends AttachmentTargetType(software.amazon.awscdk.services.secretsmanager.AttachmentTargetType.RDS_DB_CLUSTER)

  case object RdsDbInstance
    extends AttachmentTargetType(software.amazon.awscdk.services.secretsmanager.AttachmentTargetType.RDS_DB_INSTANCE)

  case object RdsDbProxy
    extends AttachmentTargetType(software.amazon.awscdk.services.secretsmanager.AttachmentTargetType.RDS_DB_PROXY)

  case object RedshiftCluster
    extends AttachmentTargetType(software.amazon.awscdk.services.secretsmanager.AttachmentTargetType.REDSHIFT_CLUSTER)
}
