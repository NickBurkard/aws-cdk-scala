package io.burkard.cdk.services.route53

sealed abstract class RecordType(val underlying: software.amazon.awscdk.services.route53.RecordType)
  extends Product
    with Serializable

object RecordType {
  implicit def toAws(value: RecordType): software.amazon.awscdk.services.route53.RecordType =
    Option(value).map(_.underlying).orNull

  case object A
    extends RecordType(software.amazon.awscdk.services.route53.RecordType.A)

  case object Aaaa
    extends RecordType(software.amazon.awscdk.services.route53.RecordType.AAAA)

  case object Caa
    extends RecordType(software.amazon.awscdk.services.route53.RecordType.CAA)

  case object Cname
    extends RecordType(software.amazon.awscdk.services.route53.RecordType.CNAME)

  case object Ds
    extends RecordType(software.amazon.awscdk.services.route53.RecordType.DS)

  case object Mx
    extends RecordType(software.amazon.awscdk.services.route53.RecordType.MX)

  case object Naptr
    extends RecordType(software.amazon.awscdk.services.route53.RecordType.NAPTR)

  case object Ns
    extends RecordType(software.amazon.awscdk.services.route53.RecordType.NS)

  case object Ptr
    extends RecordType(software.amazon.awscdk.services.route53.RecordType.PTR)

  case object Soa
    extends RecordType(software.amazon.awscdk.services.route53.RecordType.SOA)

  case object Spf
    extends RecordType(software.amazon.awscdk.services.route53.RecordType.SPF)

  case object Srv
    extends RecordType(software.amazon.awscdk.services.route53.RecordType.SRV)

  case object Txt
    extends RecordType(software.amazon.awscdk.services.route53.RecordType.TXT)
}
