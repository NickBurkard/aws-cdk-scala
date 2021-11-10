package io.burkard.cdk.services.servicediscovery


sealed abstract class DnsRecordType(val underlying: software.amazon.awscdk.services.servicediscovery.DnsRecordType)
  extends Product
    with Serializable


object DnsRecordType {
  implicit def toAws(value: DnsRecordType): software.amazon.awscdk.services.servicediscovery.DnsRecordType =
    Option(value).map(_.underlying).orNull

  case object A
    extends DnsRecordType(software.amazon.awscdk.services.servicediscovery.DnsRecordType.A)

  case object Aaaa
    extends DnsRecordType(software.amazon.awscdk.services.servicediscovery.DnsRecordType.AAAA)

  case object AAaaa
    extends DnsRecordType(software.amazon.awscdk.services.servicediscovery.DnsRecordType.A_AAAA)

  case object Srv
    extends DnsRecordType(software.amazon.awscdk.services.servicediscovery.DnsRecordType.SRV)

  case object Cname
    extends DnsRecordType(software.amazon.awscdk.services.servicediscovery.DnsRecordType.CNAME)
}
