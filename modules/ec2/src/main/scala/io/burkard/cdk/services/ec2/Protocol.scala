package io.burkard.cdk.services.ec2

sealed abstract class Protocol(val underlying: software.amazon.awscdk.services.ec2.Protocol)
  extends Product
    with Serializable

object Protocol {
  implicit def toAws(value: Protocol): software.amazon.awscdk.services.ec2.Protocol =
    Option(value).map(_.underlying).orNull

  case object AN
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.A_N)

  case object Ah
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.AH)

  case object All
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.ALL)

  case object Any0Hop
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.ANY_0_HOP)

  case object AnyDfs
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.ANY_DFS)

  case object AnyEnc
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.ANY_ENC)

  case object AnyLocal
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.ANY_LOCAL)

  case object Aris
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.ARIS)

  case object Ax25
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.AX_25)

  case object BbnRccMon
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.BBN_RCC_MON)

  case object Bna
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.BNA)

  case object BrSatMon
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.BR_SAT_MON)

  case object Cbt
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.CBT)

  case object Cftp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.CFTP)

  case object Chaos
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.CHAOS)

  case object CompaqPeer
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.COMPAQ_PEER)

  case object Cphb
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.CPHB)

  case object Cpnx
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.CPNX)

  case object Crtp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.CRTP)

  case object Crudp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.CRUDP)

  case object Dccp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.DCCP)

  case object DcnMeas
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.DCN_MEAS)

  case object Ddp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.DDP)

  case object Ddx
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.DDX)

  case object Dgp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.DGP)

  case object Dsr
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.DSR)

  case object Egp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.EGP)

  case object Eigrp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.EIGRP)

  case object Emcon
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.EMCON)

  case object Encap
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.ENCAP)

  case object Esp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.ESP)

  case object Etherip
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.ETHERIP)

  case object Ethernet
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.ETHERNET)

  case object Experiment1
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.EXPERIMENT_1)

  case object Experiment2
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.EXPERIMENT_2)

  case object Fc
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.FC)

  case object Fire
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.FIRE)

  case object Ggp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.GGP)

  case object Gmtp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.GMTP)

  case object Gre
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.GRE)

  case object Hip
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.HIP)

  case object Hmp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.HMP)

  case object Hopopt
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.HOPOPT)

  case object INlsp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.I_NLSP)

  case object Iatp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.IATP)

  case object Icmp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.ICMP)

  case object Icmpv6
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.ICMPV6)

  case object Idpr
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.IDPR)

  case object IdprCmtp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.IDPR_CMTP)

  case object Idrp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.IDRP)

  case object Ifmp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.IFMP)

  case object Igmp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.IGMP)

  case object Igp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.IGP)

  case object Il
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.IL)

  case object Ipcomp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.IPCOMP)

  case object Ipcv
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.IPCV)

  case object Ipip
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.IPIP)

  case object Iplt
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.IPLT)

  case object Ippc
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.IPPC)

  case object Ipv4
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.IPV4)

  case object Ipv6
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.IPV6)

  case object Ipv6Frag
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.IPV6_FRAG)

  case object Ipv6Nonxt
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.IPV6_NONXT)

  case object Ipv6Opts
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.IPV6_OPTS)

  case object Ipv6Route
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.IPV6_ROUTE)

  case object IpxInIp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.IPX_IN_IP)

  case object Irtp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.IRTP)

  case object IsisIpv4
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.ISIS_IPV4)

  case object IsoIp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.ISO_IP)

  case object IsoTp4
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.ISO_TP4)

  case object Kryptolan
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.KRYPTOLAN)

  case object L2TP
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.L2_T_P)

  case object Larp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.LARP)

  case object Leaf1
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.LEAF_1)

  case object Leaf2
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.LEAF_2)

  case object Manet
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.MANET)

  case object MeritInp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.MERIT_INP)

  case object MfeNsp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.MFE_NSP)

  case object Micp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.MICP)

  case object Mobile
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.MOBILE)

  case object MobilityHeader
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.MOBILITY_HEADER)

  case object MplsInIp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.MPLS_IN_IP)

  case object Mtp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.MTP)

  case object Mux
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.MUX)

  case object Narp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.NARP)

  case object Netblt
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.NETBLT)

  case object NsfnetIgp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.NSFNET_IGP)

  case object NvpIi
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.NVP_II)

  case object Ospfigp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.OSPFIGP)

  case object Pgm
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.PGM)

  case object Pim
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.PIM)

  case object Pipe
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.PIPE)

  case object Pnni
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.PNNI)

  case object Prm
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.PRM)

  case object Ptp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.PTP)

  case object Pup
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.PUP)

  case object Pvp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.PVP)

  case object Qnx
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.QNX)

  case object Rdp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.RDP)

  case object Reserved
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.RESERVED)

  case object Rohc
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.ROHC)

  case object Rsvp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.RSVP)

  case object RsvpE2eIgnore
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.RSVP_E2E_IGNORE)

  case object Rvd
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.RVD)

  case object SatExpak
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.SAT_EXPAK)

  case object SatMon
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.SAT_MON)

  case object SccSp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.SCC_SP)

  case object Scps
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.SCPS)

  case object Sctp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.SCTP)

  case object Sdrp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.SDRP)

  case object SecureVmtp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.SECURE_VMTP)

  case object Shim6
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.SHIM6)

  case object Skip
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.SKIP)

  case object Sm
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.SM)

  case object Smp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.SMP)

  case object Snp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.SNP)

  case object SpriteRpc
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.SPRITE_RPC)

  case object Sps
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.SPS)

  case object Srp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.SRP)

  case object Sscopmce
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.SSCOPMCE)

  case object St
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.ST)

  case object Stp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.STP)

  case object SunNd
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.SUN_ND)

  case object Swipe
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.SWIPE)

  case object Tcf
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.TCF)

  case object Tcp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.TCP)

  case object Threepc
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.THREEPC)

  case object Tlsp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.TLSP)

  case object Tpplusplus
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.TPPLUSPLUS)

  case object Trunk1
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.TRUNK_1)

  case object Trunk2
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.TRUNK_2)

  case object Ttp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.TTP)

  case object Udp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.UDP)

  case object Udplite
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.UDPLITE)

  case object Uti
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.UTI)

  case object Vines
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.VINES)

  case object Visa
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.VISA)

  case object Vmtp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.VMTP)

  case object Vrrp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.VRRP)

  case object WbExpak
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.WB_EXPAK)

  case object WbMon
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.WB_MON)

  case object Wesp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.WESP)

  case object Wsn
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.WSN)

  case object Xnet
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.XNET)

  case object XnsIdp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.XNS_IDP)

  case object Xtp
    extends Protocol(software.amazon.awscdk.services.ec2.Protocol.XTP)
}
